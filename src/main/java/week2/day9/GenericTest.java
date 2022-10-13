package week2.day9;

class Apple {

    @Override
    public String toString() {
        return "나는 사과입니다.";
    }
}

class Orange {
    @Override
    public String toString() {
        return "나는 오랜지입니다.";
    }
}

class Box<T>{

    private T object;

    public T getObject() {
        return object;
    }

    public Box() {
    }
    public Box(T object) {
        this.object = object;
    }
    public void setObject(T object) {
        this.object = object;
    }
}

class DBox<T1, T2> {
    
    private T1 obj1;
    private T2 OBJ2;

    public void setObj(T1 obj1,T2 OBJ2) {
        this.obj1 = obj1;
        this.OBJ2 = OBJ2;
    }

    public DBox() {

    }
    
    public DBox(T1 obj1, T2 OBJ2) {
        this.obj1 = obj1;
        this.OBJ2 = OBJ2;
    }

    @Override
    public String toString() {
        return this.obj1 + " & " + this.OBJ2;
    }
    
}


public class GenericTest {
    public static void main(String[] args) {
        
        DBox<String,Integer> box = new DBox<String,Integer>();
        
        box.setObj("Apple",25);
        System.out.println("box = " + box);
    }
}
