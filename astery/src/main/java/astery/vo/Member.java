package astery.vo;

import java.util.Date;

import astery.exception.NotMatchingException;

public class Member {	//설정에 필요한 계정 정보, 수정 필요
	private int code;
	private String id;
	private String password;
	private String nickname;
	private String name;
	private Date birth;
	private char gender;
	private String tel;
	private String intro;
	private String interest;
	private char official;
	private String profilephoto;
	private String address;
	
	public void changePassword(String oldPassword, String newPassword) {
		if(!oldPassword.equals(password)) {
			throw new NotMatchingException();
		}
		this.password = newPassword;
	}

	public void changeId(String newId) {
		
		this.id = newId;		
	}

	public void changeNickname(String newNickname) {
		
		
		this.nickname = newNickname;		
	}

	public void changeName(String newName) {
		
		this.name = newName;		
	}

	public void changeTel(String newTel) {
		
		
		this.tel = newTel;		
	}

	public void changeAddress(String newAddress) {
		
		
		this.address = newAddress;
	}

	public void changeIntro(String newIntro) {
		
		
		this.intro = newIntro;
	}
	
	public void changeOfficial(char newOfficial) {
		
		
		this.official = newOfficial;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public char getOfficial() {
		return official;
	}
	public void setOfficial(char official) {
		this.official = official;
	}
	public String getProfilephoto() {
		return profilephoto;
	}
	public void setProfilephoto(String profilephoto) {
		this.profilephoto = profilephoto;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
