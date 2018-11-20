package modelclass;

/**
 * Created by wolfsoft4 on 21/8/18.
 */

public class PromoteModel {
    Integer i1,i2;
    String txtoffer,txtprice,txtcutprice,txtshoes;

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public Integer getI2() {
        return i2;
    }

    public void setI2(Integer i2) {
        this.i2 = i2;
    }

    public String getTxtoffer() {
        return txtoffer;
    }

    public void setTxtoffer(String txtoffer) {
        this.txtoffer = txtoffer;
    }

    public String getTxtprice() {
        return txtprice;
    }

    public void setTxtprice(String txtprice) {
        this.txtprice = txtprice;
    }

    public String getTxtcutprice() {
        return txtcutprice;
    }

    public void setTxtcutprice(String txtcutprice) {
        this.txtcutprice = txtcutprice;
    }

    public String getTxtshoes() {
        return txtshoes;
    }

    public void setTxtshoes(String txtshoes) {
        this.txtshoes = txtshoes;
    }

    public PromoteModel(Integer i1, Integer i2, String txtoffer, String txtprice, String txtcutprice, String txtshoes) {
        this.i1 = i1;
        this.i2 = i2;
        this.txtoffer = txtoffer;
        this.txtprice = txtprice;
        this.txtcutprice = txtcutprice;
        this.txtshoes = txtshoes;
    }
}
