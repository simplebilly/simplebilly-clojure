(ns simple-billy-api.specs.stock-adjustment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stock-adjustment-data
  {
   (ds/opt :batchNumber) string?
   (ds/opt :binLocation) string?
   (ds/opt :expiryDate) inst?
   (ds/opt :productId) uuid?
   (ds/req :quantity) int?
   (ds/opt :serialNumbers) (s/coll-of string?)
   })

(def stock-adjustment-spec
  (ds/spec
    {:name ::stock-adjustment
     :spec stock-adjustment-data}))
