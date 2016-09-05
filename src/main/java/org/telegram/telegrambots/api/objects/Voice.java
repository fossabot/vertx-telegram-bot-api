/*
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2016  schors
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import io.vertx.core.json.JsonObject;
import org.telegram.telegrambots.api.interfaces.IBotApiObject;

import java.io.IOException;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * @brief This object represents a voice note
 * @date 16 of July of 2015
 */
public class Voice implements IBotApiObject {
    private static final String FILEID_FIELD = "file_id";
    private static final String DURATION_FIELD = "duration";
    private static final String MIMETYPE_FIELD = "mime_type";
    private static final String FILESIZE_FIELD = "file_size";
    @JsonProperty(FILEID_FIELD)
    private String fileId; ///< Unique identifier for this file
    @JsonProperty(DURATION_FIELD)
    private Integer duration; ///< Integer	Duration of the audio in seconds as defined by sender
    @JsonProperty(MIMETYPE_FIELD)
    private String mimeType; ///< Optional. MIME type of the file as defined by sender
    @JsonProperty(FILESIZE_FIELD)
    private Integer fileSize; ///< Optional. File size

    public Voice() {
        super();
    }

    public Voice(JsonObject jsonObject) {
        super();
        this.fileId = jsonObject.getString(FILEID_FIELD);
        this.duration = jsonObject.getInteger(DURATION_FIELD);
        if (jsonObject.containsKey(MIMETYPE_FIELD)) {
            this.mimeType = jsonObject.getString(MIMETYPE_FIELD);
        }
        if (jsonObject.containsKey(FILESIZE_FIELD)) {
            this.fileSize = jsonObject.getInteger(FILESIZE_FIELD);
        }
    }

    public String getFileId() {
        return fileId;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeStringField(FILEID_FIELD, fileId);
        gen.writeNumberField(DURATION_FIELD, duration);
        if (mimeType != null) {
            gen.writeStringField(MIMETYPE_FIELD, mimeType);
        }
        if (fileSize != null) {
            gen.writeNumberField(FILESIZE_FIELD, fileSize);
        }
        gen.writeEndObject();
        gen.flush();
    }

    @Override
    public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
        serialize(gen, serializers);
    }

    @Override
    public String toString() {
        return "Voice{" +
                "fileId='" + fileId + '\'' +
                ", duration=" + duration +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}