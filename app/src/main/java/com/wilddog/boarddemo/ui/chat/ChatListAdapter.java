package com.wilddog.boarddemo.ui.chat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.wilddog.boarddemo.R;
import com.wilddog.client.Query;

/**
 * @author Jeen
 * @since 9/16/15
 *
 * This class is an example of how to use WilddogListAdapter. It uses the <code>Chat</code> class to encapsulate the
 * data for each individual chat message
 */
public class ChatListAdapter extends WilddogListAdapter<Chat> {

    // The mUsername for this client. We use this to indicate which messages originated from this user
    private String mUsername;

    public ChatListAdapter(Query ref, Context context, String mUsername) {
        super(ref, Chat.class, context);
        this.mUsername = mUsername;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>WilddogListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     *
     * @param holder A view instance corresponding to the layout we passed to the constructor.
     * @param chat An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(ViewHolder holder, Chat chat) {
        // Map a Chat object to an entry in our listview
//        String author = chat.getAuthor();
//        TextView authorText = (TextView) view.findViewById(R.id.author);
//        authorText.setText(author + ": ");
//        // If the message was sent by this user, color it differently
//        if (author != null && author.equals(mUsername)) {
//            authorText.setTextColor(Color.RED);
//        } else {
//            authorText.setTextColor(Color.BLUE);
//        }
//        ((TextView) view.findViewById(R.id.message)).setText(chat.getMessage());
        holder.author.setText(chat.getAuthor());
        holder.message.setText(chat.getMessage());
    }
}