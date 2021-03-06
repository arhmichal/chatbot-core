package com.pardyl.chatbot.core;

import com.pardyl.chatbot.core.events.EventProcessor;

import java.util.List;

public interface BotConfiguration {
    List<EventProcessor> getEventProcessors();
}
