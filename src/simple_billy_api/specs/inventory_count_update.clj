(ns simple-billy-api.specs.inventory-count-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.inventory-count-status :refer :all]
            )
  (:import (java.io File)))


(def inventory-count-update-data
  {
   (ds/opt :countDate) inst?
   (ds/opt :countNumber) string?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :status) inventory-count-status-spec
   (ds/opt :warehouseId) string?
   })

(def inventory-count-update-spec
  (ds/spec
    {:name ::inventory-count-update
     :spec inventory-count-update-data}))
