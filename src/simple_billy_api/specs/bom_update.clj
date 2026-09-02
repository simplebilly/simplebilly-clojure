(ns simple-billy-api.specs.bom-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.bom-status :refer :all]
            )
  (:import (java.io File)))


(def bom-update-data
  {
   (ds/opt :components) any-type-spec
   (ds/opt :description) string?
   (ds/opt :name) string?
   (ds/opt :outputQuantity) int?
   (ds/opt :productId) uuid?
   (ds/opt :status) bom-status-spec
   })

(def bom-update-spec
  (ds/spec
    {:name ::bom-update
     :spec bom-update-data}))
