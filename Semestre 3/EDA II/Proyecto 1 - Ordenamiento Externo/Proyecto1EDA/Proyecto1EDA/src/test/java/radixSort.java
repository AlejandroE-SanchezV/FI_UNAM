import java.util.ArrayList;

public class radixSort {
    private ArrayList<String> list0;
    private ArrayList<String> list1;
    private ArrayList<String> list2;
    private ArrayList<String> list3;
    private ArrayList<String> list4;
    private ArrayList<String> list5;
    private ArrayList<String> list6;
    private ArrayList<String> list7;
    private ArrayList<String> list8;
    private ArrayList<String> list9;
    
    public radixSort(){
        list0 = new ArrayList<String>(); 
        list1 = new ArrayList<String>(); 
        list2 = new ArrayList<String>();
        list3 = new ArrayList<String>();
        list4 = new ArrayList<String>();
        list5 = new ArrayList<String>();
        list6 = new ArrayList<String>();
        list7 = new ArrayList<String>();
        list8 = new ArrayList<String>();
        list9 = new ArrayList<String>();
    }
    
    public ArrayList<String> radix(ArrayList<String> list){
        int it=1;
        System.out.println("listasize "+list.size()); // 33 numbers
        System.out.println("lista1.get.length "+list.get(1).length()); //6 digits
        //for(int i=list.get(1).length();i>=0;i--){ Why this doesn't work?
        for(int i=5;i>=0;i--){ //Why does it only allows to be >=4?
            for(String nm:list){
                switch(nm.charAt(i)){
                    case '0':
                        this.list0.add(nm);
                        break;
                    case '1':
                        this.list1.add(nm);
                        break;
                    case '2':
                        this.list2.add(nm);
                        break;
                    case '3':
                        this.list3.add(nm);
                        break;
                    case '4':
                        this.list4.add(nm);
                        break;
                    case '5':
                        this.list5.add(nm);
                        break;
                    case '6':
                        this.list6.add(nm);
                        break;
                    case '7':
                        this.list7.add(nm);
                        break;
                    case '8':
                        this.list8.add(nm);
                        break;
                    case '9':
                        this.list9.add(nm);
                        break;
                }
            }
            list.clear();
            list.addAll(list0);list.addAll(list1);list.addAll(list2);
            list.addAll(list3);list.addAll(list4);list.addAll(list5);
            list.addAll(list6);list.addAll(list7);list.addAll(list8);
            list.addAll(list9);
            list0.clear(); list1.clear();list2.clear();
            list3.clear();list4.clear();list5.clear();
            list6.clear();list7.clear();list8.clear();
            list9.clear();
            System.out.println("["+it+"]:"+list);
            it++;
        }
        return list;
    }
}
