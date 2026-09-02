(ns simple-billy-api.specs.production-order
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.production-order-status :refer :all]
            )
  (:import (java.io File)))


(def production-order-data
  {
   (ds/opt :bomId) uuid?
   (ds/opt :components) any-type-spec
   (ds/opt :endDate) inst?
   (ds/opt :notes) string?
   (ds/req :orderNumber) string?
   (ds/req :productId) uuid?
   (ds/req :quantity) int?
   (ds/opt :sourceWarehouseId) string?
   (ds/opt :startDate) inst?
   (ds/opt :status) production-order-status-spec
   (ds/opt :targetWarehouseId) string?
   })

(def production-order-spec
  (ds/spec
    {:name ::production-order
     :spec production-order-data}))
