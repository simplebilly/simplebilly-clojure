(ns simple-billy-api.specs.stock-transfer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.stock-transfer-status :refer :all]
            )
  (:import (java.io File)))


(def stock-transfer-data
  {
   (ds/req :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/req :sourceWarehouseId) string?
   (ds/req :status) stock-transfer-status-spec
   (ds/req :targetWarehouseId) string?
   (ds/req :transferDate) inst?
   (ds/req :transferNumber) string?
   })

(def stock-transfer-spec
  (ds/spec
    {:name ::stock-transfer
     :spec stock-transfer-data}))
