package javaOOP;

import lombok.Getter;
import lombok.Setter;

public class Topic_06_Geter_Seter {
	// Kiểm tra/ validate dữ liệu được
	@Setter
	@Getter
	public String personName;
	public int personAge;
	public int personPhone;
	public float personBankAccount;

	// Seter
	public void setPersonName(String personName) {
		if (personName == null || personName.isEmpty() || personName.isBlank()) {
			throw new IllegalArgumentException("Tên bạn nhập vào không hợp lệ");

		} else {
			this.personName = personName;
		}

	}

	// Getter
	public String getPersonName(String personName) {
		return this.personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		if (personAge < 15 && personAge > 60) {
			throw new IllegalArgumentException("Tuổi nhập vào không hợp lệ");
		} else {
			this.personAge = personAge;
		}

	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("Số điện thoại phải bắt đầu bằng: 09 - 03 - 012 -016 -018 - 019");

		} else if (personPhone < 10 || personPhone > 11) {
			throw new IllegalArgumentException("Số điện thoại phải từ 10 -11 số.");
		} else {
			this.personPhone = personPhone;
		}

	}

	public float getPersonAccount() {
		return personBankAccount;
	}

	public void setPersonAccount(float personAccount) {
		this.personBankAccount = personAccount;
	}

	public void showPersonInfor() {
		System.out.println(this.personName);
		System.out.println(this.personAge);
		System.out.println(this.personPhone);
	}

}
