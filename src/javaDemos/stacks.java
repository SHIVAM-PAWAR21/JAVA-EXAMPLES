package javaDemos;

class stack{
    int[] st=new int[10];
    int top;
    stack(){
        top=-1;
    }
     int tops(){
        if(top==-1) return -1;

        return st[top];
     }
    void push(int a){
        if(top==st.length-1){
            System.out.println("javaDemos.stack is full");
        }else{
            st[++top]=a;
            System.out.println("pushed the value "+a);
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("javaDemos.stack is the empty");
        }else{
            System.out.println("pop the top value " +st[top]);
            st[top]=0;
            top--;
        }
    }
}


public class stacks {
    public static void main(String[] args){
        stack demo=new stack();
        System.out.println(demo.tops());
        demo.push(10);
        System.out.println(demo.tops());
        demo.push(20);
        System.out.println(demo.tops());
        demo.pop();
        System.out.println(demo.tops());

    }
}
