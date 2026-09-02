(ns simple-billy-api.specs.stock-movement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.movement-type :refer :all]
            [simple-billy-api.specs.reference-type :refer :all]
            )
  (:import (java.io File)))


(def stock-movement-data
  {
   (ds/req :delta) int?
   (ds/req :movementType) movement-type-spec
   (ds/req :productId) uuid?
   (ds/req :quantity) int?
   (ds/opt :reason) string?
   (ds/opt :referenceId) string?
   (ds/opt :referenceType) reference-type-spec
   (ds/req :warehouseId) string?
   })

(def stock-movement-spec
  (ds/spec
    {:name ::stock-movement
     :spec stock-movement-data}))
