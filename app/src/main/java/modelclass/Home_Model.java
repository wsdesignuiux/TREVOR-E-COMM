package modelclass;

public class Home_Model {

    Integer heart,imageshose;
    String discount,text1;

    public Integer getHeart() {
        return heart;
    }

    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    public Integer getImageshose() {
        return imageshose;
    }

    public void setImageshose(Integer imageshose) {
        this.imageshose = imageshose;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public Home_Model(Integer heart, Integer imageshose, String discount, String text1) {
        this.heart = heart;
        this.imageshose = imageshose;
        this.discount = discount;
        this.text1 = text1;
    }


}
