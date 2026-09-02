(ns simple-billy-api.specs.bom
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.bom-status :refer :all]
            )
  (:import (java.io File)))


(def bom-data
  {
   (ds/opt :components) any-type-spec
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :outputQuantity) int?
   (ds/req :productId) uuid?
   (ds/opt :status) bom-status-spec
   })

(def bom-spec
  (ds/spec
    {:name ::bom
     :spec bom-data}))
