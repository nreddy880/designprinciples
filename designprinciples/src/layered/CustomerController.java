package layered;

/**presentation layer**/
@Controller
@RequiredArgsConstructor
public class CustomerController {
  
  private final CustomerService customerService;

  @PostMapping(value = "/customers/add-money")
  public @ResponseBody CustomerAddMoneyDTO addMoney(@RequestBody CustomerAddMoneyDTO dto) {
    return customerService.addFundsToCustomer(dto);
  }
}