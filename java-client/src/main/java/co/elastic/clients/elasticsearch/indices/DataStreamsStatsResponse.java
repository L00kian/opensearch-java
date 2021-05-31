/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.data_streams_stats.DataStreamsStatsItem;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.data_streams_stats.Response
public final class DataStreamsStatsResponse implements ToJsonp {
	private final ShardStatistics _shards;

	private final Number backingIndices;

	private final Number dataStreamCount;

	@Nullable
	private final JsonValue totalStoreSizes;

	private final Number totalStoreSizeBytes;

	private final List<DataStreamsStatsItem> dataStreams;

	// ---------------------------------------------------------------------------------------------

	protected DataStreamsStatsResponse(Builder builder) {

		this._shards = Objects.requireNonNull(builder._shards, "_shards");
		this.backingIndices = Objects.requireNonNull(builder.backingIndices, "backing_indices");
		this.dataStreamCount = Objects.requireNonNull(builder.dataStreamCount, "data_stream_count");
		this.totalStoreSizes = builder.totalStoreSizes;
		this.totalStoreSizeBytes = Objects.requireNonNull(builder.totalStoreSizeBytes, "total_store_size_bytes");
		this.dataStreams = Objects.requireNonNull(builder.dataStreams, "data_streams");

	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics _shards() {
		return this._shards;
	}

	/**
	 * API name: {@code backing_indices}
	 */
	public Number backingIndices() {
		return this.backingIndices;
	}

	/**
	 * API name: {@code data_stream_count}
	 */
	public Number dataStreamCount() {
		return this.dataStreamCount;
	}

	/**
	 * API name: {@code total_store_sizes}
	 */
	@Nullable
	public JsonValue totalStoreSizes() {
		return this.totalStoreSizes;
	}

	/**
	 * API name: {@code total_store_size_bytes}
	 */
	public Number totalStoreSizeBytes() {
		return this.totalStoreSizeBytes;
	}

	/**
	 * API name: {@code data_streams}
	 */
	public List<DataStreamsStatsItem> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("_shards");
		this._shards.toJsonp(generator, mapper);

		generator.writeKey("backing_indices");
		generator.write(this.backingIndices.doubleValue());

		generator.writeKey("data_stream_count");
		generator.write(this.dataStreamCount.doubleValue());

		if (this.totalStoreSizes != null) {

			generator.writeKey("total_store_sizes");
			generator.write(this.totalStoreSizes);

		}

		generator.writeKey("total_store_size_bytes");
		generator.write(this.totalStoreSizeBytes.doubleValue());

		generator.writeKey("data_streams");
		generator.writeStartArray();
		for (DataStreamsStatsItem item0 : this.dataStreams) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamsStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<DataStreamsStatsResponse> {
		private ShardStatistics _shards;

		private Number backingIndices;

		private Number dataStreamCount;

		@Nullable
		private JsonValue totalStoreSizes;

		private Number totalStoreSizeBytes;

		private List<DataStreamsStatsItem> dataStreams;

		/**
		 * API name: {@code _shards}
		 */
		public Builder _shards(ShardStatistics value) {
			this._shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code backing_indices}
		 */
		public Builder backingIndices(Number value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * API name: {@code data_stream_count}
		 */
		public Builder dataStreamCount(Number value) {
			this.dataStreamCount = value;
			return this;
		}

		/**
		 * API name: {@code total_store_sizes}
		 */
		public Builder totalStoreSizes(@Nullable JsonValue value) {
			this.totalStoreSizes = value;
			return this;
		}

		/**
		 * API name: {@code total_store_size_bytes}
		 */
		public Builder totalStoreSizeBytes(Number value) {
			this.totalStoreSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(List<DataStreamsStatsItem> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(DataStreamsStatsItem... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(DataStreamsStatsItem value) {
			if (this.dataStreams == null) {
				this.dataStreams = new ArrayList<>();
			}
			this.dataStreams.add(value);
			return this;
		}

		/**
		 * Set {@link #dataStreams(List)} to a singleton list.
		 */
		public Builder dataStreams(Function<DataStreamsStatsItem.Builder, ObjectBuilder<DataStreamsStatsItem>> fn) {
			return this.dataStreams(fn.apply(new DataStreamsStatsItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(Function<DataStreamsStatsItem.Builder, ObjectBuilder<DataStreamsStatsItem>> fn) {
			return this.addDataStreams(fn.apply(new DataStreamsStatsItem.Builder()).build());
		}

		/**
		 * Builds a {@link DataStreamsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamsStatsResponse build() {

			return new DataStreamsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DataStreamsStatsResponse
	 */
	public static final JsonpValueParser<DataStreamsStatsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DataStreamsStatsResponse::setupDataStreamsStatsResponseParser);

	protected static void setupDataStreamsStatsResponseParser(
			DelegatingJsonpValueParser<DataStreamsStatsResponse.Builder> op) {

		op.add(Builder::_shards, ShardStatistics.JSONP_PARSER, "_shards");
		op.add(Builder::backingIndices, JsonpValueParser.numberParser(), "backing_indices");
		op.add(Builder::dataStreamCount, JsonpValueParser.numberParser(), "data_stream_count");
		op.add(Builder::totalStoreSizes, JsonpValueParser.jsonValueParser(), "total_store_sizes");
		op.add(Builder::totalStoreSizeBytes, JsonpValueParser.numberParser(), "total_store_size_bytes");
		op.add(Builder::dataStreams, JsonpValueParser.arrayParser(DataStreamsStatsItem.JSONP_PARSER), "data_streams");

	}

}