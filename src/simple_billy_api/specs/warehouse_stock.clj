(ns simple-billy-api.specs.warehouse-stock
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def warehouse-stock-data
  {
   (ds/opt :batchNumber) string?
   (ds/opt :binLocation) string?
   (ds/opt :expiryDate) inst?
   (ds/req :productId) uuid?
   (ds/req :quantity) int?
   (ds/opt :serialNumbers) any-type-spec
   (ds/req :warehouseId) string?
   })

(def warehouse-stock-spec
  (ds/spec
    {:name ::warehouse-stock
     :spec warehouse-stock-data}))
