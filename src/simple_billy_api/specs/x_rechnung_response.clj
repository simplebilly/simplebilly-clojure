(ns simple-billy-api.specs.x-rechnung-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def x-rechnung-response-data
  {
   (ds/req :content) string?
   (ds/req :content_type) string?
   (ds/req :filename) string?
   })

(def x-rechnung-response-spec
  (ds/spec
    {:name ::x-rechnung-response
     :spec x-rechnung-response-data}))
