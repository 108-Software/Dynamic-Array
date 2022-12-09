public class Dmass<T> {

    int Staticsize;
    int counter = 0;
    int place;
    int LastSize;
    Object[] mass;

    public void setMass(int Staticsize){
        this.Staticsize=Staticsize;
        LastSize=(2*Staticsize)+10;
        mass = new Object[LastSize];
    }
    Dmass(){}

    public void AddFirst(T addf){
        counter++;
        if (place == mass.length-1){
            LastSize=LastSize*2;
            NewMass();
        }
        this.mass[place++]=addf;
    }

    public void AddLast(T addl){
        counter++;
        if (place == mass.length-1){
            LastSize=LastSize*2;
            NewMass();
        }
        mass[place++]=addl;
    }

    public void RemLast(){
        mass[counter-1]="null";
        counter--;
    }

    public void RemIndex(int REind) {
        mass[REind] = "null";

        try {if (REind>LastSize | REind<0 ) {
            throw new java.lang.ArrayIndexOutOfBoundsException();}

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Такой ячейки не существует");
        }
    }
    public void AddIndex(int ADDind, T data){
        mass[ADDind--]= data;
        try {if (ADDind>LastSize | ADDind<0 ) {
            throw new java.lang.ArrayIndexOutOfBoundsException();}

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Такой ячейки не существует");
        }
    }

    public void RemAll(){
        for (int i=0; i<LastSize; i++){
            mass[i]="null";
        }
        counter=0;
    }

    public void NewMass(){
        Object[] Mmass = new Object[2*LastSize];
        System.arraycopy(mass,0,Mmass,0,counter);
        mass=Mmass;
    }

    public void Size(){
        System.out.print(counter + "\n");
    }

    public void Print() {
        if (counter <= LastSize) {
            for (int i = 0; i < LastSize; i++) {
                System.out.print("{" + mass[i] + "} ");
            }
            System.out.print("\n");

        }
    }
}
