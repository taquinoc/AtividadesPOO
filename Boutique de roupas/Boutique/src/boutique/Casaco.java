/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

/**
 *
 * @author e6661387
 */
public class Casaco extends Roupa{

    private boolean ziper;
  private boolean botao;
    private boolean fechado;

    public Casaco(String material, String cor, float preco) {
        super(material, cor, preco);
    }
    
    public boolean isZiper() {
        return ziper;
    }

    public void setZiper(boolean ziper) {
        this.ziper = ziper;
    }

    public boolean isBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
  


    
    
    
    
}
