package br.com.joaocarloslima;


import javafx.scene.control.skin.TextInputControlSkin.Direction;
import javafx.scene.image.ImageView;

public abstract class Asset {
    
    int x;
    int y;
    ImageView imagem;
    int velocidade;
    Direcao direcao;

    public Asset(int x, int y, int velocidade, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.imagem = imagem;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public void mover(){
           if(direcao == Direcao.CIMA){
            this.y -=getVelocidade();

           }if(direcao == Direcao.BAIXO){
            this.y += getVelocidade();
           } 
           if(direcao == Direcao.DIREITA){
            this.x += getVelocidade();
           } 
           if(direcao == Direcao.ESQUERDA){
            this.x -= getVelocidade();
           } 

        //    switch (direcao) {
        //         case Direcao.CIMA:
        //             y -= velocidade;
        //             break;
        //         case Direcao.BAIXO:
        //             y += velocidade;
        //             break;
        //         case Direcao.ESQUERDA:
        //             x -= velocidade;
        //             break;
        //         case Direcao.DIREITA:
        //             x += velocidade;
        //             break;
        //     }
        
    }



    public boolean colidiuCom(Asset asset){
        return x < asset.getX() + 50 &&
        x + 50 > asset.getX() &&
        y < asset.getY() + 50 &&
        y + 50 > asset.getY();

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    


    
}

