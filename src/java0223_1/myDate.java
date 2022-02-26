package java0223_1;

public class myDate {
	
	// 입력한 연, 월, 일을 통해 해당 날짜 존재 유무 확인 
	// ex) 2022. 02. 23 존재 / 2022. 12. 32 존재x
	
	// 필드
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;		// 존재 유무
	
	
	// 생성자
	public myDate() {
		super();
	}
	
	public myDate(int day, int month, int year, boolean isValid) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.isValid = isValid;
	}
	
	
	// 메소드
	public int getDay() {
		System.out.println("getDay : " + day);
		return day;
	}

	public void setDay(int day) {
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			if(day>0 && day<=31) {
				this.day = day;
			} else {
				isValid = false;
			}
			break;
			
		case 4 : case 6 : case 9 : case 11 : 
			if(day>0 && day<=30) {
				this.day = day;
			} else {
				isValid = false;
			}
			break;
			
		case 2 : 
			// 윤년 => 4년마다 한 번씩 허용 / 100년일 때 제외 / 400년마다 한 번씩 허용
			if((year%4==0 && year%100!=0) || year%400==0) {
				if(day>0 && day<=29) {
					this.day = day;
				} else {
					isValid = false;
				} 
			} else {
				if(day>0 && day<=28) {
					this.day = day;
				} else {
					isValid = false;
				}
			}

			break;
			
		default : 
			isValid = false;
			break;
		}
	}

	public int getMonth() {
		System.out.println("getMonth : " + month);
		return month;
	}

	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
		} else {
			isValid = false;
		}
	}

	public int getYear() {
		System.out.println("getYear : " + year);
		return year;
	}

	public void setYear(int year) {
		if(year>0) {
			this.year = year;
			// 기본적으로 isValid = true; 설정되어있음
		} else {
			isValid = false;
		}
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "myDate [day=" + day + ", month=" + month + ", year=" + year + ", isValid=" + isValid + "]";
	}
	
	
	
	
}
