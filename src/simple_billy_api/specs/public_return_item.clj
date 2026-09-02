(ns simple-billy-api.specs.public-return-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def public-return-item-data
  {
   (ds/opt :name) string?
   (ds/req :productId) string?
   (ds/req :quantity) int?
   (ds/opt :reason) string?
   })

(def public-return-item-spec
  (ds/spec
    {:name ::public-return-item
     :spec public-return-item-data}))
