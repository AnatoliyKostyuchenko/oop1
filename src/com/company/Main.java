package com.company2;

import com.company.Worker;

public class Main{
    public void main(String[] args) {
        Worker Worker = new Worker[5];
        Worker[0] = new Worker("Ivan Ivanov","Jurist","ivan@mail.ru",79834551678,60000,156);
        Worker[0] = new Worker("Illarion Bruksov","stalker","illario@mail.ru",79824551678,200000,25);
        Worker[0] = new Worker("Ildar Mamedov","prezident","rezidence@mail.ru",99999999999,450000,45);
        Worker[0] = new Worker("Inham Bareeyv","doctor","inhamdoc@mail.ru",79836657789,100000,106);
        Worker[0] = new Worker("Ayron Medniy","FSB","ivan@mail.ru",79834551678,20000,81);
    }
}
for(i=0;i < Worker.length; i++){
    if(Worker[i]getAge()>40){
Worker[i].getInfo();
        }
        }