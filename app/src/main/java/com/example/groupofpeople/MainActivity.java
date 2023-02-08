package com.example.groupofpeople;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RailwayTicket railwayTicket = new RailwayTicket(70, 9);
    RailwayTicket railwayTicketChild = new RailwayTicketChild(70, 11, 50);
    RailwayTicket railwayTicketRetiree = new RailwayTicketRetiree(70, 5, 30);

    private TextView railwayTicketOut;
    private TextView railwayTicketChildOut;
    private TextView railwayTicketRetireeOut;
    private TextView railwayTicketTotalOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketRetireeOut = findViewById(R.id.railwayTicketRetireeOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);

        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + " монет");
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + " монет");
        railwayTicketRetireeOut.setText(Float.toString(railwayTicketRetiree.ticketPriceAll()) + " монет");
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() +
                railwayTicketChild.ticketPriceAll() + railwayTicketRetiree.ticketPriceAll()) + " монет");
    }
}