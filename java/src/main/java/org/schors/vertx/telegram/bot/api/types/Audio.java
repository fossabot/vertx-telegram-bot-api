/*
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2016 schors
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

package org.schors.vertx.telegram.bot.api.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Audio {

    @JsonProperty("file_id")
    private String fileId;
    private Integer duration;
    private String performer;
    private String title;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private Integer fileSize;

    public Audio() {
    }

    public Audio(String fileId, Integer duration, String performer, String title, String mimeType, Integer fileSize) {
        this.fileId = fileId;
        this.duration = duration;
        this.performer = performer;
        this.title = title;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }

    public String getFileId() {
        return fileId;
    }

    public Audio setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Audio setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getPerformer() {
        return performer;
    }

    public Audio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Audio setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Audio setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Audio setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
