package week2.day8.hm;

class PolyExample {

    public static void main(String args[]) {

        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();

    }

}


class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열 cart에 사용될 index

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("돈이 부족합니다 종료합니다");
            return;
        } else {
            money-=p.price;
            add(p);
        }
    }


    void add(Product p) {
        Product[] tmp = null;
        if(i >= cart.length){

            tmp = new Product[cart.length*2];

		 for(int i =0; i < cart.length; i++){

			 tmp[i] = cart[i];

		 }
            cart = tmp;
        }
        cart[i++] = p;

    }


    void summary() {

        int sum = 0;
        System.out.print("구입한 물건 : ");

        for (Product product : cart) {
            if (product != null) {
                System.out.print(product + ", ");
                sum += product.price;
            }
        }
        System.out.println();
        System.out.println("사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + money);
    }

}


class Product {

    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}


class Tv extends Product {

    Tv() {
        super(100);
    }


    public String toString() {
        return "Tv";
    }
}


class Computer extends Product {

    Computer() {
        super(200);
    }


    public String toString() {
        return "Computer";
    }

}


class Audio extends Product {

    Audio() {
        super(50);
    }


    public String toString() {
        return "Audio";
    }

}
