(ns simple-billy-api.specs.inventory-count
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.inventory-count-status :refer :all]
            )
  (:import (java.io File)))


(def inventory-count-data
  {
   (ds/req :countDate) inst?
   (ds/req :countNumber) string?
   (ds/req :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/req :status) inventory-count-status-spec
   (ds/req :warehouseId) string?
   })

(def inventory-count-spec
  (ds/spec
    {:name ::inventory-count
     :spec inventory-count-data}))
