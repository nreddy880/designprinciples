package layered;

/**we can add our Data Layer that will be our connection to the database**/
/**Data Layer**/

	@Component
	class CustomerMapper {
	  
	  public CustomerAddMoneyDto mapToDto(CustomerEntity customerEntity) {
	    CustomerAddMoneyDto dto = new CustomerAddMoneyDto();
	    dto.username = customerEntity.getUsername();
	    dto.moneyAmount = customerEntity.getMoneyAmount();
	    return dto;
	  }
	  
	}


