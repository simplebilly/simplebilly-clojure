(ns simple-billy-api.specs.contact-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def contact-info-data
  {
   (ds/req :hint) string?
   (ds/req :hintEn) string?
   (ds/req :role) string?
   (ds/req :roleEn) string?
   })

(def contact-info-spec
  (ds/spec
    {:name ::contact-info
     :spec contact-info-data}))
