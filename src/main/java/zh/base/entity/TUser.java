package zh.base.entity;

import java.util.Date;

public class TUser {
    private String id;

    private String username;

    private String password;

    private Date createdate;

    private Date updatedate;

    private String createipaddress;

    private String updateipaddress;

    private Date registerdate;

    private String registeripaddress;

    private String groupid;

    private String menugroupid;

    private String loginidaddress;

    private String useraddress;

    private String salt;

    private String phone;

    private String sex;

    private String qq;

    private String email;

    private Date birthday;

    private String description;

    private String imageurl;

    private String school;

    private String bloodtype;

    private String says;

    private String locked;

    private String freeze;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getCreateipaddress() {
        return createipaddress;
    }

    public void setCreateipaddress(String createipaddress) {
        this.createipaddress = createipaddress == null ? null : createipaddress.trim();
    }

    public String getUpdateipaddress() {
        return updateipaddress;
    }

    public void setUpdateipaddress(String updateipaddress) {
        this.updateipaddress = updateipaddress == null ? null : updateipaddress.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getRegisteripaddress() {
        return registeripaddress;
    }

    public void setRegisteripaddress(String registeripaddress) {
        this.registeripaddress = registeripaddress == null ? null : registeripaddress.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getMenugroupid() {
        return menugroupid;
    }

    public void setMenugroupid(String menugroupid) {
        this.menugroupid = menugroupid == null ? null : menugroupid.trim();
    }

    public String getLoginidaddress() {
        return loginidaddress;
    }

    public void setLoginidaddress(String loginidaddress) {
        this.loginidaddress = loginidaddress == null ? null : loginidaddress.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says == null ? null : says.trim();
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public String getFreeze() {
        return freeze;
    }

    public void setFreeze(String freeze) {
        this.freeze = freeze == null ? null : freeze.trim();
    }
}