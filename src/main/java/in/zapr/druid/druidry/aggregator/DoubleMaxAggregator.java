/*
 * Copyright (c) 2017-present, Red Brick Lane Marketing Solutions Pvt. Ltd.
 * All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package in.zapr.druid.druidry.aggregator;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class DoubleMaxAggregator extends DruidAggregator {

    private static final String DOUBLE_MAX_TYPE_AGGREGATOR = "doubleMax";
    private String fieldName;

    public DoubleMaxAggregator(@NonNull String name, @NonNull String fieldName) {
        this.type = DOUBLE_MAX_TYPE_AGGREGATOR;
        this.name = name;
        this.fieldName = fieldName;
    }
}