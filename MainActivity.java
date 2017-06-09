package com.littlebearsoftworks.complimentmate;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nice(View view)
    {
        TextView text = (TextView)findViewById(R.id.greeting);
        String message = comp();
        text.setText(message);

        ImageView img= (ImageView)findViewById(R.id.imageView);
        if(message.equals("Remember: Millions of sperm cells are released in an ejaculation. You are the one that made it!!!"))
        {
            Picasso.with(this).load(R.drawable.smile4).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile4);
        }
        else if(message.equals("You're a ROCKSTAR!!!"))
        {
            Picasso.with(this).load(R.drawable.smile16).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile3);
        }
        else if(message.equals("Have you been working out? Cuz you looking fiiinnneee"))
        {
            Picasso.with(this).load(R.drawable.smile6).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile6);
        }
        else if(message.equals("All our problems are temporary."))
        {
            Picasso.with(this).load(R.drawable.smile5).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile5);
        }
        else if(message.equals("Lets cuddle"))
        {
            Picasso.with(this).load(R.drawable.smile8).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile8);
        }
        else if(message.equals("You put in some serious work today. Good Job!"))
        {
            Picasso.with(this).load(R.drawable.smile15).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile9);
        }
        else if(message.equals("You're the coolest person I know"))
        {
            Picasso.with(this).load(R.drawable.smile10).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile10);
        }
        else if(message.equals("I'm lovin your haircut"))
        {
            Picasso.with(this).load(R.drawable.smile11).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile11);
        }
        else if(message.equals("He may think his shit doesn't stink, but we all know better"))
        {
            Picasso.with(this).load(R.drawable.smile18).resize(200,250).into(img);
            //img.setImageResource(R.drawable.smile7);
        }
        else if(message.equals("We can take on the world. You and me."))
        {
            Picasso.with(this).load(R.drawable.smile12).resize(200,150).into(img);
            //img.setImageResource(R.drawable.smile12);
        }
        else if(message.equals("Let's keep moving forward"))
        {
            Picasso.with(this).load(R.drawable.smile13).resize(200,150).into(img);
        }
        else if(message.equals("I like your style"))
        {
            Picasso.with(this).load(R.drawable.smile14).resize(200,350).into(img);
        }
        else if(message.equals("You are number 1"))
        {
            Picasso.with(this).load(R.drawable.smile9).resize(200,150).into(img);
        }
        else if(message.equals("If a zombie apocalypse broke out, I would want you with me."))
        {
            Picasso.with(this).load(R.drawable.smile17).resize(200,150).into(img);
        }
        else if(message.equals("Don't worry, you're my hero"))
        {
            Picasso.with(this).load(R.drawable.smile19).resize(200,150).into(img);
        }
        else if(message.equals("Your boss might not appreciate you, but I do"))
        {
            Picasso.with(this).load(R.drawable.smile7).resize(200,150).into(img);
        }
        else {
            Picasso.with(this).load(chgPic()).resize(200,150).into(img);
            //img.setImageResource(chgPic());
        }

    }

    private String comp()
    {
        Random rand = new Random();

        String[] sweetness = new String[50];
        sweetness[0] = "Don't worry, you're my hero";
        sweetness[1] = "Whatever it is, you'll get it eventually";
        sweetness[2] = "He may think his shit doesn't stink, but we all know better";
        sweetness[3] = "Your boss might not appreciate you, but I do";
        sweetness[4] = "I believe in you";
        sweetness[5] = "Roses are red, violets are blue, the only person i need is you";
        sweetness[6] = "You look FABULOUS in those shoes!";
        sweetness[7] = "Have you been working out? Cuz you looking fiiinnneee";
        sweetness[8] = "You put in some serious work today. Good Job!";
        sweetness[9] = "We can do this";
        sweetness[10] = "Remember: Millions of sperm cells are released in an ejaculation." +
                " You are the one that made it!!!";
        sweetness[11] = "You're a ROCKSTAR!!!";
        sweetness[12] = "Sup Superstar!";
        sweetness[13] = "I feel you bro";
        sweetness[14] = "I gotchu bruh";
        sweetness[15] = "I think you're strong enough";
        sweetness[16] = "Samba Time";
        sweetness[17] = "All our problems are temporary.";
        sweetness[18] = "It's all gucci baby";
        sweetness[19] = "We can pull through. Trust me.";
        sweetness[20] = "I'm lovin your haircut";
        sweetness[21] = "I like your style";
        sweetness[22] = "You really light up this disco baby!";
        sweetness[23] = "If I had arms, I would hug you";
        sweetness[24] = "I mean...I think your jokes are funny.";
        sweetness[25] = "I don't think your dance moves suck...";
        sweetness[26] = "I like your eyes";
        sweetness[27] = "I like your ears";
        sweetness[28] = "You piss excellence";
        sweetness[29] = "I like your ideas";
        sweetness[30] = "If a zombie apocalypse broke out, I would want you with me.";
        sweetness[31] = "You poop glitter";
        sweetness[32] = "My day is better when I see you";
        sweetness[33] = "If I was captain of a team, you would be first pick.";
        sweetness[34] = "You make me smile";
        sweetness[35] = "You're the coolest person I know";
        sweetness[36] = "I love it when you push my button";
        sweetness[37] = "Lets cuddle";
        sweetness[38] = "Sup SUNSHINE!";
        sweetness[39] = "We should chill";
        sweetness[40] = "You are number 1";
        sweetness[41] = "You're my favorite";
        sweetness[42] = "Mucho gusto brochacho";
        sweetness[43] = "I like your outfit";
        sweetness[44] = "I think you are classy";
        sweetness[45] = "Let's keep moving forward";
        sweetness[46] = "I love hanging out with you";
        sweetness[47] = "Your parents are lucky to have had you";
        sweetness[48] = "You deserve that promotion";
        sweetness[49] = "We can take on the world. You and me.";

        String msg = "";
        int num = rand.nextInt(50);
        msg = sweetness[num];
        return msg;
    }

    private int chgPic()
    {
        int pic = 0;
        int[] smiles = new int[12];
        smiles[0]= R.drawable.smile;
        smiles[1]= R.drawable.smile2;
        smiles[2]= R.drawable.smile3;
        smiles[3]= R.drawable.smile4;
        smiles[4]= R.drawable.smile5;
        smiles[5]= R.drawable.smile6;
        smiles[6]= R.drawable.smile7;
        smiles[7]= R.drawable.smile8;
        smiles[8]= R.drawable.smile9;
        smiles[9]= R.drawable.smile10;
        smiles[10]= R.drawable.smile11;
        smiles[11]= R.drawable.smile12;

        Random rand = new Random();
        pic = rand.nextInt(3);

        return smiles[pic];
    }
}
