package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.image.ImageView;

public class Jogo {

    protected List<Asset> assets = new ArrayList<>();
    protected Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);
    private int pontos;
    private int nivel = 1;
    
    public Tiro atirar(){
        Tiro tiro = nave.atirar(this.nivel);
        assets.add(tiro); 
        return tiro;
    }

    public Meteoro criarMeteoro(){
        Random random = new Random();
        int x = random.nextInt(590); 
        Meteoro meteoro = new Meteoro(x, 0, 2, Direcao.BAIXO); 
        assets.add(meteoro); 
        return meteoro;
    }
    
    public void pontuar(){
        pontos += 1;

        if(nivel != 4 && pontos == 10){
            nivel += 1;
        }
        
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public Nave getNave() {
        return nave;
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }


    
  











    
    
}
