(ns simple-billy-api.specs.offenlegung-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def offenlegung-item-data
  {
   (ds/req :exists) boolean?
   (ds/req :name) string?
   (ds/req :source) string?
   })

(def offenlegung-item-spec
  (ds/spec
    {:name ::offenlegung-item
     :spec offenlegung-item-data}))
