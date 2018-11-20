package modelclass;

/**
 * Created by wolfsoft4 on 22/8/18.
 */

public class MostLikedModel {
   Integer image1,image2;
   String textoffer,textprice,textshoes;

    public Integer getImage1() {
        return image1;
    }

    public void setImage1(Integer image1) {
        this.image1 = image1;
    }

    public Integer getImage2() {
        return image2;
    }

    public void setImage2(Integer image2) {
        this.image2 = image2;
    }

    public String getTextoffer() {
        return textoffer;
    }

    public void setTextoffer(String textoffer) {
        this.textoffer = textoffer;
    }

    public String getTextprice() {
        return textprice;
    }

    public void setTextprice(String textprice) {
        this.textprice = textprice;
    }

    public String getTextshoes() {
        return textshoes;
    }

    public void setTextshoes(String textshoes) {
        this.textshoes = textshoes;
    }

    public MostLikedModel(Integer image1, Integer image2, String textoffer, String textprice, String textshoes) {
        this.image1 = image1;
        this.image2 = image2;
        this.textoffer = textoffer;
        this.textprice = textprice;
        this.textshoes = textshoes;
    }
}