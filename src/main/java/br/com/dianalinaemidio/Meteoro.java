package br.com.joaocarloslima;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset{
    
    int tamanho;
    int poder;


    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        Random random = new Random();
        tamanho = random.nextInt(8) + 1; 
        poder = tamanho; 
        String path = "images/meteoro/meteoro" + tamanho + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
           
    }

    public void tomarTiro(Tiro tiro){
        this.poder -= tiro.getPoder();
       
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPoder() {
        return poder;
    }


    

}
