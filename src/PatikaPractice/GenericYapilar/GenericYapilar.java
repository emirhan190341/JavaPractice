package PatikaPractice.GenericYapilar;

public class GenericYapilar <T> {
    //generic yapilar herhangi bir durumda bir veriye int string vs. gibi bir atama yapmak istemiyorsak kullanilir. daha esnek bir kod kurmayi saglar.

    private final T value;

    public GenericYapilar(T value){
        this.value = value;

    }

    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu degiskene deger atanmamisdir.");
        }else{
            System.out.println(this.getValue());
        }
    }




}
