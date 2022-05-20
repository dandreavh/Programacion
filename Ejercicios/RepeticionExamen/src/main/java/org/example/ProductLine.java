package org.example;

public class ProductLine {
    private String productLine;
    private String txtDescription;
    private String htmlDescription;
    private String img;

    public ProductLine(String productLine, String txtDescription, String htmlDescription, String img) {
        this.productLine = productLine;
        this.txtDescription = txtDescription;
        this.htmlDescription = htmlDescription;
        this.img = img;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "productLine='" + productLine + '\'' +
                ", txtDescription='" + txtDescription + '\'' +
                ", htmlDescription='" + htmlDescription + '\'' +
                ", img='" + img + '\'' +
                '}' + '\n';
    }
}
