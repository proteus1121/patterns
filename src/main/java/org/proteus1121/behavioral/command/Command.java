package org.proteus1121.behavioral.command;

interface Command {
    void execute();
    void undo();
}