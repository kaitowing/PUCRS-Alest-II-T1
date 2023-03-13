import java.util.ArrayList;
import java.util.LinkedList;

public class Macaco {
    private LinkedList<Coco> cocos = new LinkedList<Coco>();
    private int nome;
    private int impar;
    private int par;

    public Macaco(int cocos, ArrayList<Integer> pedrinhas, int numero, int imp, int pog){
        nome = numero;
        impar = imp;
        par = pog;
        for (int i = 0; i < cocos; i++) {
            Coco newcoco = new Coco(pedrinhas.get(i));
            this.cocos.add(newcoco);
        }
    }

    public void trocaMacaco(Macaco macaconovo){
        this.cocos = macaconovo.cocos;
    }

    public Coco passaCoco(){
        return cocos.remove(0);
    } 
    
    public void addCoco(Coco coco){
        cocos.add(coco);
    }

    /**
     * @return ArrayList<Coco> return the cocos
     */
    public LinkedList<Coco> getCocos() {
        return cocos;
    }

    /**
     * @param cocos the cocos to set
     */
    public void setCocos(LinkedList<Coco> cocos) {
        this.cocos = cocos;
    }

    /**
     * @return int return the nome
     */
    public int getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(int nome) {
        this.nome = nome;
    }


    /**
     * @return int return the impar
     */
    public int getImpar() {
        return impar;
    }

    /**
     * @param impar the impar to set
     */
    public void setImpar(int impar) {
        this.impar = impar;
    }

    /**
     * @return int return the par
     */
    public int getPar() {
        return par;
    }

    /**
     * @param par the par to set
     */
    public void setPar(int par) {
        this.par = par;
    }

}
