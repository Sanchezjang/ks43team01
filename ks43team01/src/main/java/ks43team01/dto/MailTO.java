package ks43team01.dto;

public class MailTO {
	  private String address;
	    private String title;
	    private String message;
	    
	    
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("MailTO [address=");
			builder.append(address);
			builder.append(", title=");
			builder.append(title);
			builder.append(", message=");
			builder.append(message);
			builder.append("]");
			return builder.toString();
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	    
	   
	}

