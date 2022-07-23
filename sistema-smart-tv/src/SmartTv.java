public class SmartTv {

    // estados da TV

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // métodos que manipulam esses estados:


    // _________________________________________
    // Métodos para mudar/aumentar/diminuir o canal da TV:

    public void mudarCanal(int novoCanal){ //aqui o usuário poderá digitar um parâmetro dentro da função, para reatribuir um valor para o canal
        canal = novoCanal;
    }


    public void aumentarCanal(){
        canal++;
        // System.out.println("Aumentando o canal da TV para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        // System.out.println("Diminuindo o canal da TV para: " + canal);
    }

    // _________________________________________
    // Métodos para volume da TV:

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume da TV para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume da TV para: " + volume);
    }

    // __________________________________________
    // Métodos TV ligada/desligada:

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}

// ______________________________________________
// aprendizados:

// 1 - o nome dos métodos são legíveis e bem explicitos quanto ao que ele faz
// 2 - Nem todos os métodos precisam retornar algo
// 3 - Alguns métodos terão parâmetro
// 4 - E esses métodos poderão alterar as variáveis ou as características do nosso objeto principal