package kr.co.leeku.wms.model;

import java.util.List;

public class ShipWhListModel extends ResultModel {
    //출고처 모델

    List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public class Item extends ResultModel{
        //창고코드
        String wh_code;
        //창고명
        String wh_name;
        //창고타입
        String wh_type;
        //???
        String wh_order;

        public String getWh_code() {
            return wh_code;
        }

        public void setWh_code(String wh_code) {
            this.wh_code = wh_code;
        }

        public String getWh_name() {
            return wh_name;
        }

        public void setWh_name(String wh_name) {
            this.wh_name = wh_name;
        }

        public String getWh_type() {
            return wh_type;
        }

        public void setWh_type(String wh_type) {
            this.wh_type = wh_type;
        }

        public String getWh_order() {
            return wh_order;
        }

        public void setWh_order(String wh_order) {
            this.wh_order = wh_order;
        }
    }
}