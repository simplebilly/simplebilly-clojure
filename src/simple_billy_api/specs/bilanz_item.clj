(ns simple-billy-api.specs.bilanz-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bilanz-item-data
  {
   (ds/req :amount) string?
   (ds/req :konto) string?
   (ds/req :name) string?
   })

(def bilanz-item-spec
  (ds/spec
    {:name ::bilanz-item
     :spec bilanz-item-data}))
