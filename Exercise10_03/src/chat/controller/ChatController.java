package chat.controller;

import chat.domain.mediator.ChatModel;
import chat.domain.model.Message;
import chat.domain.model.MessageList;
import chat.view.ChatView;

public class ChatController
{
  private ChatModel model;
  private ChatView view;

  public ChatController(ChatModel model, ChatView view)
  {
    this.model = model;
    this.view = view;
  }

  public void execute(String what)
  {
    switch (what.toLowerCase())
    {
      case "send":
        String message = view.getMessage();
        if (message.length() > 0)
        {
          model.addMessage(new Message(message));
          view.show(message);
        }
        break;
      case "quit":
        System.exit(0);
        break;
      default:
        if (what.length() > 0)
        {
          model.addMessage(new Message(what));
          view.show(what);
        }
    }
  }
}
