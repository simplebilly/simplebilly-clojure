(ns simple-billy-api.specs.gu-v-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gu-v-item-data
  {
   (ds/req :account) string?
   (ds/req :amount) string?
   (ds/req :name) string?
   })

(def gu-v-item-spec
  (ds/spec
    {:name ::gu-v-item
     :spec gu-v-item-data}))
