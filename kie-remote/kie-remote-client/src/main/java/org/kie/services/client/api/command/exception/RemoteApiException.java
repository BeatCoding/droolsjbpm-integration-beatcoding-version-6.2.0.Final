package org.kie.services.client.api.command.exception;


/**
 * This exception is thrown when the remote API returns a message indicating
 * that the request operation (REST or JMS) has failed. 
 * </p>
 * In other words, this exception indicates<ul>
 * <li>That the communication has succeeded</li>
 * <li>But that the requested operation has failed due to problems on the server side</li>
 * </ul>
 */
@Deprecated
public class RemoteApiException extends RuntimeException {

    public RemoteApiException(String s) {
        super(s);
    }

    public RemoteApiException(String s, Throwable throwable) {
        super(s, throwable);
    }

}