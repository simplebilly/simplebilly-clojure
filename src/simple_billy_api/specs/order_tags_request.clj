(ns simple-billy-api.specs.order-tags-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-tags-request-data
  {
   (ds/req :tags) (s/coll-of string?)
   })

(def order-tags-request-spec
  (ds/spec
    {:name ::order-tags-request
     :spec order-tags-request-data}))
