(ns simple-billy-api.specs.import-start-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def import-start-request-data
  {
   (ds/req :apiKey) string?
   (ds/req :provider) string?
   (ds/req :years) (s/coll-of int?)
   })

(def import-start-request-spec
  (ds/spec
    {:name ::import-start-request
     :spec import-start-request-data}))
