/* HERE THIS IS THE POJO CLASS
where POJO - Plain Old Java Object


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppliancesInfo;

/**
 *
 * @author Nitro7
 */
public class TableData {
    
    private String mdNo;
    private String appName;
    private String categ;
    private String price;
    private String recom;
    private String rangeValue;

    public TableData(String mdNo, String appName, String categ, String recom, String rangeValue, String price) {
        this.mdNo = mdNo;
        this.appName = appName;
        this.categ = categ;
        this.recom= recom;
        this.rangeValue= rangeValue;
        this.price = price;
    }

    TableData(String numberList, String nameList, String categoryList, String recomList,String rangeList, Integer priceList) {

    }

    public String getMdNo() {
        return mdNo;
    }

    public String getAppName() {
        return appName;
    }

    public String getCateg() {
        return categ;
    }
    
    public String getRecom(){
        return recom;
    }
    
    public String getRangeValue(){
        return rangeValue;
    }

    public String getPrice() {
        return price;
    }
     
    
    
}
