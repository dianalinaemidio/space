package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        
        
    }

   

    public Tiro atirar(int poder){
        return new Tiro(x, y, 10,  Direcao.CIMA, poder);
    }


    @Override
    public void mover(){
        
        if (direcao == Direcao.ESQUERDA && x - velocidade >= 0) {
            x -= velocidade;
        } else if (direcao == Direcao.DIREITA && x + velocidade <= 640 - 50) {
            x += velocidade;
        }
    }
}
    
    

