(ns simple-billy-api.specs.section
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def section-data
  {
   (ds/req :bodyHtml) string?
   (ds/req :bodyHtmlEn) string?
   (ds/req :id) string?
   (ds/req :title) string?
   (ds/req :titleEn) string?
   })

(def section-spec
  (ds/spec
    {:name ::section
     :spec section-data}))
